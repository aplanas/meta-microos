SUMMARY = "LeechCraft Last.FM Scrobble Module"
DESCRIPTION = "This package contains the LastFMScrobble plugin for LeechCraft \
which supports the Last.FM service. For example, it scrobbles tracks \
from other players, requests similar artists (on demand by other players as \
well), supports fetching album art, etc. \
 \
Features: \
 * Scrobbling listened tracks from other players like LMP to Last.FM. \
 * 'Loving' listened tracks. \
 * Support for requesting artists that are similar to a given artist. \
 * Automatic fetching of album art. \
 * Support for Last.FM radio. \
 * Fetching personalized recommendations. \
 * Fetching recent releases of artists that are in the user's collection. \
 * Fetching artists biography. \
 * Configurable language of the fetched information."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lastfmscrobble-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "fab0fede0718534535f21977e1a8b188ace8063d7b7923cf8a1fb5874dd0e224e508773dff0457aba6c6209fd0dff3d143161a9eee5aae14e822afef36dc75e5"

RPROVIDES:${PN} += "leechcraft-lastfmscrobble \
leechcraft-lastfmscrobble(aarch-64) \
leechcraft-scrobbler \
libleechcraft_lastfmscrobble.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
leechcraft-lmp \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblastfm5.so.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
