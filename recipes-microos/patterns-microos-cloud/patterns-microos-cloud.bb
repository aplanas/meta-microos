SUMMARY = "Support for Cloud"
DESCRIPTION = "Packages required to enable openSUSE MicroOS in the Cloud."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cloud-5.0-69.1.aarch64.rpm"
RPM_HASH = "9673d1c5e6eaa8199a2ca5d6f435f44249006a9edf9d636e49c71e279f7a9a5c6c7d82b1317a0c04ecf3c30a7907a6708a7de43d56e861b6ad2a07dd38647d2f"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-cloud patterns-microos-cloud(aarch-64)"
RDEPENDS:${PN} += "cloud-init cloud-init-config-MicroOS"

inherit rpm
