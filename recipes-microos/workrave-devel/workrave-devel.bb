SUMMARY = "Development Files for workrave"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "workrave-devel-1.10.50-2.2.aarch64.rpm"
RPM_HASH = "e812f281561589e92ce5eb5049985e9660a1143f8619323ed4e4a90126868109a7b778df6ccc5a9825440489042674a7915343b647735c4bc69c90512b54864c"

RPROVIDES:${PN} += "workrave-devel workrave-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
