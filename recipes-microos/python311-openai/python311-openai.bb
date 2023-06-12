SUMMARY = "OpenAI bindings for python"
DESCRIPTION = "The OpenAI Python library provides convenient access to the OpenAI API \
from applications written in the Python language. It includes a \
pre-defined set of classes for API resources that initialize \
themselves dynamically from API responses which makes it compatible \
with a wide range of versions of the OpenAI API. \
 \
You can find usage examples for the OpenAI Python library in \
 https://beta.openai.com/docs/api-reference?lang=python \
 https://github.com/openai/openai-cookbook/."
LICENSE = "MIT"

PV = "0.26.2"

RPM_NAME = "python311-openai-0.26.2-1.5.noarch.rpm"
RPM_HASH = "485fdb040af05a830d85968eebda9311dbf5889283b7d6bc54400f3891206a2b8b9d90874eece95877464304eaa8fbbf420d1b79b3fbe4208070280a7384f1f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openai) \
python311-openai \
python3dist(openai)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-aiohttp \
python311-requests \
python311-tqdm \
update-alternatives"

inherit rpm
