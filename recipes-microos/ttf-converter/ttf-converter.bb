SUMMARY = "Python script that converts fonts to TrueType format"
DESCRIPTION = "A Python script that converts fonts to TrueType format. It uses \
the fontforge python bindings to read/process and write any font \
format. Also, as part of the conversion process, the script \
tries to fix inconsistencies and do necessary changes to the font \
to honor the TTF format specs."
LICENSE = "GPL-3.0-only"

PV = "1.0.7"

RPM_NAME = "ttf-converter-1.0.7-1.1.noarch.rpm"
RPM_HASH = "95087a9168d6eb151df68429b6fc491ede7daa7be603b405b6957382552d4ef74dc19050afc4e44858ea9927a366fd0d00364f7ab114224733d958c33e4c9721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ttf-converter"
RDEPENDS:${PN} += "/usr/bin/python3 \
fontforge \
ftdump \
python3-base"

inherit rpm
