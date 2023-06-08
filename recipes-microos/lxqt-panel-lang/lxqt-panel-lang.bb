SUMMARY = "Translations for package lxqt-panel"
DESCRIPTION = "Provides translations for the 'lxqt-panel' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-panel-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "3a684f41604fde06545600ffee855971fde5e0ebe9dfcda4483dd9fe0531f2c6cc29b05b4706ac5cc8d364c3121e5e3b39b489923f6c144e70e4113536c9e713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-panel-lang lxqt-panel-lang-all"
RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
