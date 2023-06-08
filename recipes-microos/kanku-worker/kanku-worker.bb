SUMMARY = "Worker daemon for kanku"
DESCRIPTION = "A remote worker for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-worker-0.14.0-1.3.noarch.rpm"
RPM_HASH = "ed307e8b96b0751ac987d65ce0e7150271f2ba78d9e44589adf28278430811382930ef85b32c44aec5660fb711d52c9fd55e51f59a69674293e855ec4796c9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-worker perl(Kanku::Daemon::Worker)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env kanku-common kanku-common-server perl(Net::AMQP::RabbitMQ) perl(Sys::CPU) perl(Sys::LoadAvg) perl(Sys::MemInfo) perl(UUID) qemu-arm"

inherit rpm
