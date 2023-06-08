SUMMARY = "Plugins For PipeWire SPA"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Unlimited input/output ports; \
 * Per port format enumeration and negotiation; \
 * Enumeration/configuration of per port parameters; \
 * Application controlled buffer allocation with option to let the plugin \
   Allocate memory; \
 * Arbitrary buffer metadata; \
 * Buffers are passed around by id which is very fast and avoids the need \
   for refcounting; \
 * Synchronous and asynchronous processing; \
 * All api is designed to work without any allocations; \
 * Arbirary input/output behaviour. \
 \
This package provides plugins for extending PipeWire SPA's functionality."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-spa-plugins-0_2-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "0060c7d270a5217fa46978e5c5a92479212f76f1a760b34191550a6459e5f93f26688e68f239719b3c1b30d32360f36ab8b2c757a6cfe5089edfea540d5f5bf3"

RPROVIDES:${PN} += "libspa-aec-null.so()(64bit) libspa-aec-webrtc.so()(64bit) libspa-alsa.so()(64bit) libspa-audioconvert.so()(64bit) libspa-audiomixer.so()(64bit) libspa-audiotestsrc.so()(64bit) libspa-avb.so()(64bit) libspa-bluez5.so()(64bit) libspa-codec-bluez5-aac.so()(64bit) libspa-codec-bluez5-faststream.so()(64bit) libspa-codec-bluez5-lc3.so()(64bit) libspa-codec-bluez5-ldac.so()(64bit) libspa-codec-bluez5-opus.so()(64bit) libspa-codec-bluez5-sbc.so()(64bit) libspa-control.so()(64bit) libspa-dbus.so()(64bit) libspa-jack.so()(64bit) libspa-journal.so()(64bit) libspa-libcamera.so()(64bit) libspa-support.so()(64bit) libspa-test.so()(64bit) libspa-v4l2.so()(64bit) libspa-videoconvert.so()(64bit) libspa-videotestsrc.so()(64bit) libspa-vulkan.so()(64bit) pipewire-spa-plugins-0_2 pipewire-spa-plugins-0_2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libasound.so.2(ALSA_0.9.0rc8)(64bit) libbluetooth.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcamera-base.so.0.0.4()(64bit) libcamera.so.0.0.4()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libfdk-aac.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjack.so.0()(64bit) liblc3.so.1()(64bit) libldacBT_abr.so.2()(64bit) libldacBT_enc.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopus.so.0()(64bit) libsbc.so.1()(64bit) libsbc.so.1(SBC_1.0)(64bit) libsbc.so.1(SBC_1.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libusb-1.0.so.0()(64bit) libvulkan.so.1()(64bit) libwebrtc_audio_processing.so.1()(64bit)"

inherit rpm
