SUMMARY = "Character Set Converter"
DESCRIPTION = "Recode converts files between various character sets."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.14"

RPM_NAME = "recode-devel-3.7.14-1.1.aarch64.rpm"
RPM_HASH = "7318d2952f075925eae0d4a7e2b3cbfbb7e07103d492573e3e52f1014f7adada16bffb528619df0a1dab57c1868ec3ad42e599dec2e50182993d462ca4c97fa6"

RPROVIDES:${PN} += "recode-devel \
recode-devel(aarch-64)"
RDEPENDS:${PN} += "librecode3"

inherit rpm
