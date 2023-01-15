FROM python:3.9.16 AS build
#https://github.com/watson-developer-cloud/python-sdk/issues/418 - gcc error, using non slim

#RUN apk update
#RUN apk add git
#RUN apk add bash
#RUN addgroup -S frankuser && adduser -S -D frankuser -G frankuser
#https://man7.org/linux/man-pages/man8/useradd.8.html
RUN addgroup --system frankuser && adduser --system frankuser --ingroup frankuser

USER frankuser

WORKDIR /home/app
RUN git clone https://github.com/AUTOMATIC1111/stable-diffusion-webui.git

WORKDIR models/Stable-diffusion
RUN git clone https://huggingface.co/CompVis/stable-diffusion-v-1-4-original

EXPOSE 7860

WORKDIR /home/app/stable-diffusion-webui
RUN chmod 777 webui.sh
ENTRYPOINT ["./webui.sh"]


#https://towardsdatascience.com/launch-a-web-api-for-stable-diffusion-under-45-seconds-bbd88cfe41d8

#################################################################
#Launching launch.py...
#################################################################
#Python 3.9.16 (main, Jan 11 2023, 15:55:30)
#[GCC 10.2.1 20210110]
#Commit hash: d97f467c0d27695d23edad5e4f8898a57e0ccb00
#Installing torch and torchvision
#Traceback (most recent call last):
#  File "/home/app/stable-diffusion-webui/launch.py", line 307, in <module>
#    prepare_environment()
#  File "/home/app/stable-diffusion-webui/launch.py", line 221, in prepare_environment
#    run_python("import torch; assert torch.cuda.is_available(), 'Torch is not able to use GPU; add --skip-torch-cuda-test to COMMANDLINE_ARGS variable to disable this check'")
#  File "/home/app/stable-diffusion-webui/launch.py", line 88, in run_python
#    return run(f'"{python}" -c "{code}"', desc, errdesc)
#  File "/home/app/stable-diffusion-webui/launch.py", line 64, in run
#    raise RuntimeError(message)
#RuntimeError: Error running command.
#Command: "/home/app/stable-diffusion-webui/venv/bin/python3" -c "import torch; assert torch.cuda.is_available(), 'Torch is not able to use GPU; add --skip-torch-cuda-test to COMMANDLINE_ARGS variable to disable this check'"
#Error code: 1
#stdout: <empty>
#stderr: Traceback (most recent call last):
#  File "<string>", line 1, in <module>
#AssertionError: Torch is not able to use GPU; add --skip-torch-cuda-test to COMMANDLINE_ARGS variable to disable this check
#

