SUMMARY = "Development files for nauty, a math library"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs. They can also produce a canonical label. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libnauty."
LICENSE = "Apache-2.0"

PV = "2.8.6"

RPM_NAME = "nauty-devel-2.8.6-1.3.aarch64.rpm"
RPM_HASH = "d768cf41f3c4fb75e1df41206b24697c09d19ad4a63c4d5245fe1c93670309b5a757215a2db5f9d73c6dd6e44e39c2d286f575402ed581a3102695f1abaf75da"

RPROVIDES:${PN} += "nauty-devel nauty-devel(aarch-64)"
RDEPENDS:${PN} += "libnauty-2_8_6"

inherit rpm
