SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python39-PTable-0.9.2-2.11.noarch.rpm"
RPM_HASH = "4776f32e48226f20c8a200a35bc1f6c15973c5592c109d752a440b1fd07c29a75ab395dcde3d13b5375ad7effa161cfd94abec6a1196f7f28ead784cbfd0864e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ptable) \
python39-PTable \
python3dist(ptable)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi)"

inherit rpm
