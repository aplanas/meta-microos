SUMMARY = "Specific customization of systemd defaults settings for SLE-Micro"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for SLE-Micro distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-SLE-Micro-0.7-2.6.noarch.rpm"
RPM_HASH = "70396bbc3db3eee80bb96c0f5e3b890cf8e2d31f05308a0f50aed8fc24386f38838e91f7f708083727adc7873130ab4518e2b5526369f5664142f90b01704680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding systemd-default-settings-branding-SLE-Micro"
RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
