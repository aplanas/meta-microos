SUMMARY = "Include files for development with libffi"
DESCRIPTION = "The libffi library provides a portable, high level programming \
interface to various calling conventions.  This allows a programmer to \
call any function specified by a call interface description at run \
time."
LICENSE = "MIT"

PV = "3.4.4"

RPM_NAME = "libffi-devel-3.4.4-1.3.aarch64.rpm"
RPM_HASH = "64b02beee99af25afe204c84fc25bdfe0e942a8de026d09e891df2562c1489511635359d4807ed45f49548e01de38ed3a13d510439d476f7856e9b3079f8a726"

RPROVIDES:${PN} += "libffi-devel libffi-devel(aarch-64) pkgconfig(libffi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libffi8"

inherit rpm
