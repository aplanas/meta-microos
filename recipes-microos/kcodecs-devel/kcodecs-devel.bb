SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcodecs-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "a25d47d65816916399a0be1b04eaffa4a778bc87f9593ec712b6ab3b98e65987183ab61021e5aa64fd3eefdc5719a8f12a5e27f5850b36eb718ce943b20d207e"

RPROVIDES:${PN} += "cmake(KF5Codecs) kcodecs-devel kcodecs-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5Codecs5"

inherit rpm
