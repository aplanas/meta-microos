SUMMARY = "GSettings integration of the dconf key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems. \
 \
This package provides a GSettings backend that uses dconf to store \
the settings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "gsettings-backend-dconf-0.40.0-3.3.aarch64.rpm"
RPM_HASH = "dd6b650f738b5b35b6a90806ede1e315684dada62b126b58d4b4b47cb5a84548ad2f2d23a34c7e4eeb3b0b2c5cc318251c502536583e7c5450ee051ace06218d"

RPROVIDES:${PN} += "gsettings-backend-dconf gsettings-backend-dconf(aarch-64) libdconfsettings.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh dconf glib2-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
