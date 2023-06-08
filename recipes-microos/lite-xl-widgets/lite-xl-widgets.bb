SUMMARY = "Widgets for lite-xl"
DESCRIPTION = "* A widgets plugin that can be used by plugin writers to more easily implement interactive UI elements. \
* The plugin leverages lite-xl View system and provides ready to use components to reduce code duplication \
for stuff that most of the time is the same and simplify the process of writing your own GUI controls."
LICENSE = "MIT"

PV = "git20221227.a632bfd"

RPM_NAME = "lite-xl-widgets-git20221227.a632bfd-1.2.noarch.rpm"
RPM_HASH = "b8ebee9a565438c4a87aba1bf7d2e4506dea47676dc4fc8aaf546a9b8b82778d33d1102a7bb115eeab11158df94c1981f29ef607b4d88c0f5fd56d2bea19042a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lite-xl-widgets"
RDEPENDS:${PN} += "lite-xl"

inherit rpm
