SUMMARY = "GUI date picker for Java using SWT"
DESCRIPTION = "SWTCalendar is a port of Kai Toedter's JCalendar to Eclipse's SWT. \
It is a GUI date picker for Java using SWT as the GUI toolkit. \
SWTCalendar was designed to be a flexible component so developer \
can embed a date picker in their application or create their own \
standalone date picker dialog."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "swtcalendar-0.5-3.6.noarch.rpm"
RPM_HASH = "7d799d892591bd05db8b8ef6075d7caaf1e93bff8f3920eb3858e49a9a5f15b8607ad6d7c1bf084d46816091b56f809d11f50216a17203b47900068cf878b1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swtcalendar"
RDEPENDS:${PN} += ""

inherit rpm
