SUMMARY = "brld-orca brlapi"
DESCRIPTION = "this python module enables orca to use brld for braille output"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.5.0.20130317.git7a75bc29"

RPM_NAME = "sbl-orca-3.5.0.20130317.git7a75bc29-6.14.aarch64.rpm"
RPM_HASH = "6162df36ee9c490d5e155df4271e090775f85b437525cb2f88c6c1bd379905d5a6ae15efb3e6df8dd029f674ed363f3ffbab23975c7de27babc04689728d51dd"

RPROVIDES:${PN} += "sbl-orca \
sbl-orca(aarch-64)"
RDEPENDS:${PN} += "orca \
python(abi)"

inherit rpm
