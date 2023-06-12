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

RPM_NAME = "python310-openai-0.26.2-1.5.noarch.rpm"
RPM_HASH = "14e525834e1b462443cecb9530445cb7d67b61d8cfe2480741798a33c4b9ee124c5ab12acddcb8e433183b7ce1c14d17d269443de439dd6f1795a9883b73e56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openai \
python3.10dist(openai) \
python310-openai \
python3dist(openai)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-aiohttp \
python310-requests \
python310-tqdm \
update-alternatives"

inherit rpm
