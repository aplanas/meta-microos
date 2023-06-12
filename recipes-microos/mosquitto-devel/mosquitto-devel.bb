SUMMARY = "Development files for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the development files."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "mosquitto-devel-2.0.15-1.4.aarch64.rpm"
RPM_HASH = "6bc0a7cc69efe43ea418c0c045e0a1fe74c16266c94d8302dfd3de8f27a321f5657856b97ab4816c33bee9e771e17b9b9bf85bfc9b7a561142cebf18a1a823dc"

RPROVIDES:${PN} += "libmosquitto-devel \
libmosquittopp-devel \
mosquitto-devel \
mosquitto-devel(aarch-64) \
pkgconfig(libmosquitto) \
pkgconfig(libmosquittopp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmosquitto1 \
libmosquittopp1"

inherit rpm
