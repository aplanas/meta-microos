SUMMARY = "Project templates for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the project templates package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.2"

RPM_NAME = "kicad-templates-7.0.2-1.1.noarch.rpm"
RPM_HASH = "c860a80978d0f8233e2433d3351b0dc99add9f29bfe4336d9f1c5d82d61ea1bfc1845ed91e3abb97aa544c3d66fe05534487e54b8b6c69dbe03d27fe309b9559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library:/usr/share/kicad/template/Arduino_Fio/fp-lib-table kicad-templates"
RDEPENDS:${PN} += ""

inherit rpm
