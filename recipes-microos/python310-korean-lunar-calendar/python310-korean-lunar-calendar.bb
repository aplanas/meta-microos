SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-korean-lunar-calendar-0.3.1-1.3.noarch.rpm"
RPM_HASH = "f8333e34c0482dbd79787a7771f62d97b9010da699f516f68353ff616751b35a2a853f5661a5551f7bb78ef9d495484a2c35ca38104e68042f70448b4bfc5736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-korean-lunar-calendar \
python3-korean_lunar_calendar \
python3.10dist(korean-lunar-calendar) \
python310-korean-lunar-calendar \
python310-korean_lunar_calendar \
python3dist(korean-lunar-calendar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
