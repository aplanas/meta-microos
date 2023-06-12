SUMMARY = "Scripts for porting applications to KF5"
DESCRIPTION = "This package contains the scripts to make the porting KDE software from \
kdelibs and Qt4 to Qt5 and KDE Frameworks 5."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kdesdk-scripts-kf5-porting-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0760329354b1bf31fc8e2d982237c6ae372e32ba3d79ae7048339b66a41bacfdb6323d342e9cfd447e13956fa2942b662db001265626f18c2c40248190a2c818"

RPROVIDES:${PN} += "kdesdk-scripts-kf5-porting kdesdk-scripts-kf5-porting(aarch-64) kdesdk4-scripts-kf5-porting perl(functionUtilkde)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/perl"

inherit rpm
