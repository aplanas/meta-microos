SUMMARY = "Fish Completion for ripgrep"
DESCRIPTION = "The official fish completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-fish-completion-13.0.0-5.3.noarch.rpm"
RPM_HASH = "60bc7c17bb9137c2324a62585c924483a46f5bd93c57aa4bb306d90dedf5a07865aaeca28859629c5c991f1014c3c07da09385e07daa559b667dac6d608c4757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm
