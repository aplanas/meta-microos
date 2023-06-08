SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "This is the minimal runtime system. It is really a minimal system. It is intended as base for Appliances."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-minimal_base-20200505-40.1.aarch64.rpm"
RPM_HASH = "dcd2ede0b57aba0d57b2193f8e66ab924f85045b86195b02081ff6a48539c652eb539e83e6025bdbfde5757cda74b721ec4959b1f069c8a9d546ee0b86f9ace0"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-minimal_base patterns-base-minimal_base(aarch-64) patterns-openSUSE-minimal_base"
RDEPENDS:${PN} += "branding build-key distribution-release filesystem"

inherit rpm
