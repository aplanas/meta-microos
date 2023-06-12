SUMMARY = "Remote Attestation (Agent) Support"
DESCRIPTION = "Packages required to enable remote attestation via the Rust Keylime \
agent on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_agent-5.0-70.1.aarch64.rpm"
RPM_HASH = "847f7d9b2acb7718d3c5b164b47e22339241d04d4ab99ee505a7a7b4a1012f62323b3fc90031419e680c6516f9f672de2cc57fc66040efd8e96465b2e25295f7"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-ra_agent \
patterns-microos-ra_agent(aarch-64)"
RDEPENDS:${PN} += "dmidecode \
pattern() \
rust-keylime"

inherit rpm
