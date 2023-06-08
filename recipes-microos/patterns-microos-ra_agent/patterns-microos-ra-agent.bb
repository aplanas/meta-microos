SUMMARY = "Remote Attestation (Agent) Support"
DESCRIPTION = "Packages required to enable remote attestation via the Rust Keylime \
agent on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_agent-5.0-69.1.aarch64.rpm"
RPM_HASH = "2001e71b6a1722b987a23b69d63d652fb37b3ec72c8ceb7973d7795904233b4373e7fc34d1151adad6b931db26e186697e0a060850b83632129c67bce4f2b3a3"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-ra_agent patterns-microos-ra_agent(aarch-64)"
RDEPENDS:${PN} += "dmidecode pattern() rust-keylime"

inherit rpm
