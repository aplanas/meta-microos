SUMMARY = "Rook FlexVolume driver"
DESCRIPTION = "Rook uses FlexVolume to integrate with Kubernetes for performing storage \
operations."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-rookflex-1.6.2+git0.ge8fd65f08-2.7.aarch64.rpm"
RPM_HASH = "275520a914e9b7f5b0f5f970471ac7480d623fc28a246b872aa9d50702b93c6855a326dfd0f26b5a17e0af7bcda768d8bbcc74cb0a58d45517895112c65f6bf8"

RPROVIDES:${PN} += "rook-rookflex rook-rookflex(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
