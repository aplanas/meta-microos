SUMMARY = "A static content management system"
DESCRIPTION = "A static content management system for building complex websites out \
of flat files for people who do not want to make a compromise between \
a CMS and a static blog engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.7"

RPM_NAME = "python311-Lektor-3.3.7-1.5.noarch.rpm"
RPM_HASH = "5a3433530a0076ec05bb83ee4318dd30f29a6e7c3abee5d4369ef1107561ad2654aea440a487508ae11925367e4ad3bacaa48af1ff923984e3641a483e4928ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lektor) \
python311-Lektor \
python3dist(lektor)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Babel \
python311-ExifRead \
python311-Flask \
python311-Jinja2 \
python311-click \
python311-filetype \
python311-inifile \
python311-mistune \
python311-python-slugify \
python311-requests \
python311-setuptools \
python311-watchdog \
update-alternatives"

inherit rpm
