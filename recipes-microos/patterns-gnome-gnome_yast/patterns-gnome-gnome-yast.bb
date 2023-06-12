SUMMARY = "YaST GNOME User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for the GNOME desktop."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_yast-20201210-16.1.aarch64.rpm"
RPM_HASH = "4b554f1dc23fff4390b5379a280650a5ce98454f9b66ccc6c6d5993092dc53e49146ea001c25bd2e475006dafeaca91affb0df7a81850c4579fe6ed043a13b3d"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_yast \
patterns-gnome-gnome_yast(aarch-64) \
patterns-openSUSE-gnome_yast"
RDEPENDS:${PN} += "libyui-qt-pkg \
yast2-control-center-qt"

inherit rpm
