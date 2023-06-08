SUMMARY = "Header and source files for creating Orthanc plugins"
DESCRIPTION = "This package includes the header files to develop C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.0"

RPM_NAME = "orthanc-devel-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "57963b9df7c19a33205eac80b9a7062b274e0c45fcb6abaef8737626c4d320979aadc6ac3f653eafc5b20cea7cea3ebc0e544cb98ec9b5dc5fd0e19ad2054e7f"

RPROVIDES:${PN} += "orthanc-devel orthanc-devel(aarch-64) orthanc-static"
RDEPENDS:${PN} += ""

inherit rpm
