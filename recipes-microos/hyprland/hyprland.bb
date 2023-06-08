SUMMARY = "Dynamic tiling Wayland compositor"
DESCRIPTION = "Hyprland is a dynamic tiling Wayland compositor based on wlroots \
that doesn't sacrifice on its looks. \
 \
It supports multiple layouts, fancy effects, has a very flexible IPC \
model allowing for a lot of customization, and more."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "hyprland-0.24.1-1.1.aarch64.rpm"
RPM_HASH = "437cc1cbc38bf4443dbfdd5881665d3ff2f5067d01d53d8a85729d7d14889f31d522cfc72114b7c812ada38dcb7b3b2a11b268bd9dad1cfb481d3f0b80d72495"

RPROVIDES:${PN} += "hyprland hyprland(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdisplay-info.so.1()(64bit) libdrm.so.2()(64bit) libgbm.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgobject-2.0.so.0()(64bit) libinput.so.10()(64bit) libinput.so.10(LIBINPUT_0.12.0)(64bit) libinput.so.10(LIBINPUT_0.14.0)(64bit) libinput.so.10(LIBINPUT_0.19.0)(64bit) libinput.so.10(LIBINPUT_0.20.0)(64bit) libinput.so.10(LIBINPUT_0.21.0)(64bit) libinput.so.10(LIBINPUT_1.1)(64bit) libinput.so.10(LIBINPUT_1.19)(64bit) libinput.so.10(LIBINPUT_1.2)(64bit) libinput.so.10(LIBINPUT_1.3)(64bit) libinput.so.10(LIBINPUT_1.4)(64bit) libinput.so.10(LIBINPUT_1.5)(64bit) libinput.so.10(LIBINPUT_1.7)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpixman-1.so.0()(64bit) libseat.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libvulkan.so.1()(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit) libxcb-composite.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb-errors.so.0()(64bit) libxcb-ewmh.so.2()(64bit) libxcb-icccm.so.4()(64bit) libxcb-present.so.0()(64bit) libxcb-render-util.so.0()(64bit) libxcb-render.so.0()(64bit) libxcb-res.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb-xinput.so.0()(64bit) libxcb.so.1()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbcommon.so.0(V_0.8.0)(64bit)"

inherit rpm
