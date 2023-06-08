SUMMARY = "Documentation and samples for Ruby"
DESCRIPTION = "Documentation and samples for Ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-doc-3.2.2-1.1.aarch64.rpm"
RPM_HASH = "fa22c1910da2b349b6dec471d524fd35294060c8822e3d7ff715288535d358622457b3d9b2cc38bed5c0b908ce54255271d78396a100ef7baf485b8b32a33db7"

RPROVIDES:${PN} += "ruby3.2-doc ruby3.2-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
