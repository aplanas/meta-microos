SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-moban-0.8.2-2.6.noarch.rpm"
RPM_HASH = "f6f121b2b28468094ebd21f00a5123ca4fe63be226afc87beb1de6a6aa23415eafb9ac04e480bb8178c8a92f2655b77268b4e953aa99778c4e2fd5971a3c1719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(moban) \
python39-moban \
python3dist(moban)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
git-core \
python(abi) \
python39-Jinja2 \
python39-appdirs \
python39-crayons \
python39-fs \
python39-jinja2-fsloader \
python39-lml \
python39-ruamel.yaml \
update-alternatives"

inherit rpm
