SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-korean-lunar-calendar-0.3.1-1.3.noarch.rpm"
RPM_HASH = "58220c4078ba92cfcaef657819f1c7104d2f659b57021702506ebdcf1b1b650a15d07e0fb6c0b252f5a366f91bdfc67bee2ad579682c7987abbbd5c5e06aff84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(korean-lunar-calendar) python311-korean-lunar-calendar python311-korean_lunar_calendar python3dist(korean-lunar-calendar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
