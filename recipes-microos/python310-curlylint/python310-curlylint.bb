SUMMARY = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid"
DESCRIPTION = "HTML templates linting for Jinja, Nunjucks, Django templates, Twig, Liquid."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python310-curlylint-0.13.1-1.4.noarch.rpm"
RPM_HASH = "7cd2c8717dded35aca74597b8ab4a6e39928039b4596794e4bf5d9e8724f736b52595f5049b8703be05bf99707a3e47ebe9769d9bce113a34a91a8f85189aa97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curlylint \
python3.10dist(curlylint) \
python310-curlylint \
python3dist(curlylint)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-attrs \
python310-click \
python310-parsy \
python310-pathspec \
python310-toml"

inherit rpm
