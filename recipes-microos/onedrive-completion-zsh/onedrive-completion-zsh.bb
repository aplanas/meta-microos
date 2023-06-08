SUMMARY = "OneDrive zsh completition"
DESCRIPTION = "OneDrive shell completions for zsh."
LICENSE = "GPL-3.0-only"

PV = "2.4.23"

RPM_NAME = "onedrive-completion-zsh-2.4.23-1.4.aarch64.rpm"
RPM_HASH = "aaa3c1e51b8edd561b2d7d0f9ebc1f2bce60435cfc87e6e75babf7557977d65e84f1581a7b409e00602737204d0a7a67e8c29fa004078539f34bf096d97af637"

RPROVIDES:${PN} += "onedrive-completion-zsh onedrive-completion-zsh(aarch-64)"
RDEPENDS:${PN} += "zsh"

inherit rpm
