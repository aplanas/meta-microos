SUMMARY = "Translations for package goldendict"
DESCRIPTION = "Provides translations for the 'goldendict' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.0~rc2+git.20220215T203220"

RPM_NAME = "goldendict-lang-1.5.0~rc2+git.20220215T203220-2.8.noarch.rpm"
RPM_HASH = "7e4505aa5a345bb377d3e8db25ce29355bf88a53f9a8264ff38244bc26fcca06a4586e4beddb920a2c4403cf98eb9ac0c1cfd73efe4ccd666bd904427546c172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goldendict-lang goldendict-lang-all"
RDEPENDS:${PN} += "goldendict"

inherit rpm
