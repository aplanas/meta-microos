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

RPM_NAME = "python39-openai-0.26.2-1.5.noarch.rpm"
RPM_HASH = "632b06da68fd622bb505005a48981ba020aa55cebf44feaf2644e92b464be328c420ec35cff27361076d7b7000e27533a45c5a193cebfc9aa1ee104174e041e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openai) \
python39-openai \
python3dist(openai)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-aiohttp \
python39-requests \
python39-tqdm \
update-alternatives"

inherit rpm
