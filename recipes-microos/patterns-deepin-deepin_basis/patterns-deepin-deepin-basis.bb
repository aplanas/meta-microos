SUMMARY = "Deepin Base System"
DESCRIPTION = "Base packages for the Deepin desktop environment."
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_basis-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "f6fd1d21cdcba1d163f64313caa8ebce7a81d2a7484004023dcb2efce235c032d82d351d8cb3b266845b76fabb086bf2a0ba116f86587f8236c7b4e2f386527f"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-deepin-deepin_basis patterns-deepin-deepin_basis(aarch-64)"
RDEPENDS:${PN} += "deepin-account-faces deepin-api deepin-control-center deepin-control-center-data deepin-daemon deepin-desktop deepin-desktop-base deepin-desktop-schemas deepin-dock deepin-file-manager deepin-gtk-theme deepin-icon-theme deepin-kwin deepin-launcher deepin-network-utils deepin-polkit-agent deepin-pw-check deepin-session-shell deepin-session-ui deepin-start libqt5-dxcbplugin pattern() qt5integration"

inherit rpm
