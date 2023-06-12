SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "This is the minimal runtime system. It is really a minimal system. It is intended as base for Appliances."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-minimal_base-20200505-41.1.aarch64.rpm"
RPM_HASH = "d73c65824760aa1410e75f766dbe736fdb279c52d81537eb2060b6693d7c3d613c308bc64d58f579203aa06aa9a8179e5d061a5e49992e7953ef600ec2e9c51f"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-minimal_base patterns-base-minimal_base(aarch-64) patterns-openSUSE-minimal_base"
RDEPENDS:${PN} += "branding build-key distribution-release filesystem"

inherit rpm
