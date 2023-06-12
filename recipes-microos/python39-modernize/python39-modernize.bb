SUMMARY = "A tool for modernizing Python code using lib2to3"
DESCRIPTION = "A hack on top of fissix for modernizing Python code."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python39-modernize-0.8.0-2.9.noarch.rpm"
RPM_HASH = "ac6d1041bb40f3da608a1c87588541e198cdb864a719100c63bb8fb60d4047db44b441e79af42d3c8a97f6ae0ee1820f55300092ec904e7aa32ee534258a6231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(modernize) \
python39-modernize \
python3dist(modernize)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-dbm \
python39-fissix \
update-alternatives"

inherit rpm
