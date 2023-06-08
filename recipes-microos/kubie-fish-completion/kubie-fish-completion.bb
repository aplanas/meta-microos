SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.19.3"

RPM_NAME = "kubie-fish-completion-0.19.3-2.3.noarch.rpm"
RPM_HASH = "c77b86981ab85c79406db5093ec2515c629a74acab2f9327fff070b8bcf410e148546e5416e3d4f6a12d8d15362dacb25497db417a17fe4d0b497ccf2babe7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"
RDEPENDS:${PN} += "kubie"

inherit rpm
