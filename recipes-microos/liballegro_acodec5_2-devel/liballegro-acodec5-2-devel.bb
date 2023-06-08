SUMMARY = "Development files for liballegro_acodec"
DESCRIPTION = "Development files needed to build applications which use liballegro_acodec."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_acodec5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "c6389c5eaf7e55e215cabefd08d534ad3463f2381706e5233347a3a638be20aac2a573dc3d4c650870e419f1d56feca4edc2751fca7daffb11288ddb302edf34"

RPROVIDES:${PN} += "liballegro_acodec5_2-devel liballegro_acodec5_2-devel(aarch-64) pkgconfig(allegro_acodec-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liballegro_acodec5_2 pkgconfig(allegro_audio-5)"

inherit rpm
