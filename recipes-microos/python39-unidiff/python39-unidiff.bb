SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python39-unidiff-0.7.4-1.5.noarch.rpm"
RPM_HASH = "39e52ea5b2893365ae5d9310f4f9cb28756b9849f9d592f869fb10c23ede5d380881f90f695e71aad2926bd34671c562bea106637180c89cd29471a1db676ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(unidiff) \
python39-unidiff \
python3dist(unidiff)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
