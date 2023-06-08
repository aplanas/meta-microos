SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-devel-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "84e9d0122453217d370af24a47b0ff2b04a4920556737bd240c15ed90e9c006f1ddd56642ecdc6d8a92f71ee8d0c26ec824a659892bd085c75922ad30b7fd23f"

RPROVIDES:${PN} += "pipewire-devel pipewire-devel(aarch-64) pkgconfig(libpipewire-0.3) pkgconfig(libspa-0.2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpipewire-0_3-0 pkgconfig(libspa-0.2)"

inherit rpm
