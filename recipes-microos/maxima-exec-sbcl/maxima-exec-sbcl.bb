SUMMARY = "Maxima compiled with SBCL"
DESCRIPTION = "Maxima compiled with SBCL."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-exec-sbcl-5.46.0-1.19.aarch64.rpm"
RPM_HASH = "8f412ac6cc37b0a1d38149fdc10eb81bc9396fa9d971491cd12e9bde9f3c9bf3e4c165e84ef093c488102b80e1cae977b2658e98b680c20f9b7a38234ed7b862"

RPROVIDES:${PN} += "maxima-exec-sbcl maxima-exec-sbcl(aarch-64) maxima_exec"
RDEPENDS:${PN} += "sbcl"

inherit rpm
