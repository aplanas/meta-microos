SUMMARY = "Scripts for porting applications to KF5"
DESCRIPTION = "This package contains the scripts to make the porting KDE software from \
kdelibs and Qt4 to Qt5 and KDE Frameworks 5."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kdesdk-scripts-kf5-porting-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2c40abed1b8f7e42dbf504aabb88d7f06166883a63d4aea66a352f4c38ccd1b778fea6b9ce8ad694e40a5cd265219591ea994cf4f673a4fdac23a498659fab25"

RPROVIDES:${PN} += "kdesdk-scripts-kf5-porting kdesdk-scripts-kf5-porting(aarch-64) kdesdk4-scripts-kf5-porting perl(functionUtilkde)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/perl"

inherit rpm
