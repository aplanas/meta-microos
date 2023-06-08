SUMMARY = "Qt 6 GUI related libraries"
DESCRIPTION = "The Qt GUI module provides classes for windowing system integration, \
event handling, OpenGL and OpenGL ES integration, 2D graphics, basic \
imaging, fonts and text. These classes are used internally by Qt's \
user interface code and can also be used directly, for instance, to \
write applications using low-level OpenGL ES graphics APIs. \
 \
For application developers writing user interfaces, Qt provides \
higher level APIs, like Qt Quick, which are much more suitable than \
the enablers found in the Qt GUI module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Gui6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "360fdbc8ba95269b1f7c8416e3a75c37a6ec8c3dbb18b24a9ca05c204cd75b1f919f4c5025fefce299c1bff793ce8c3596efbb4b172c6efe13543021b74ce41a"

RPROVIDES:${PN} += "libQt6EglFSDeviceIntegration.so.6()(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.0)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.1)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.2)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.3)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.4)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.5)(64bit) libQt6EglFSDeviceIntegration.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6EglFsKmsGbmSupport.so.6()(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.0)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.1)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.2)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.3)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.4)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.5)(64bit) libQt6EglFsKmsGbmSupport.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6EglFsKmsSupport.so.6()(64bit) libQt6EglFsKmsSupport.so.6(Qt_6)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.0)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.1)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.2)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.3)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.4)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.5)(64bit) libQt6EglFsKmsSupport.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.0)(64bit) libQt6Gui.so.6(Qt_6.1)(64bit) libQt6Gui.so.6(Qt_6.2)(64bit) libQt6Gui.so.6(Qt_6.3)(64bit) libQt6Gui.so.6(Qt_6.4)(64bit) libQt6Gui.so.6(Qt_6.5)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui6 libQt6Gui6(aarch-64) libQt6XcbQpa.so.6()(64bit) libcomposeplatforminputcontextplugin.so()(64bit) libcomposeplatforminputcontextplugin.so(Qt_6)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.0)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.1)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.2)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.3)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.4)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.5)(64bit) libcomposeplatforminputcontextplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libibusplatforminputcontextplugin.so()(64bit) libibusplatforminputcontextplugin.so(Qt_6)(64bit) libibusplatforminputcontextplugin.so(Qt_6.0)(64bit) libibusplatforminputcontextplugin.so(Qt_6.1)(64bit) libibusplatforminputcontextplugin.so(Qt_6.2)(64bit) libibusplatforminputcontextplugin.so(Qt_6.3)(64bit) libibusplatforminputcontextplugin.so(Qt_6.4)(64bit) libibusplatforminputcontextplugin.so(Qt_6.5)(64bit) libibusplatforminputcontextplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqeglfs-emu-integration.so()(64bit) libqeglfs-emu-integration.so(Qt_6)(64bit) libqeglfs-emu-integration.so(Qt_6.0)(64bit) libqeglfs-emu-integration.so(Qt_6.1)(64bit) libqeglfs-emu-integration.so(Qt_6.2)(64bit) libqeglfs-emu-integration.so(Qt_6.3)(64bit) libqeglfs-emu-integration.so(Qt_6.4)(64bit) libqeglfs-emu-integration.so(Qt_6.5)(64bit) libqeglfs-emu-integration.so(Qt_6.5.0_PRIVATE_API)(64bit) libqeglfs-kms-egldevice-integration.so()(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.0)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.1)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.2)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.3)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.4)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.5)(64bit) libqeglfs-kms-egldevice-integration.so(Qt_6.5.0_PRIVATE_API)(64bit) libqeglfs-kms-integration.so()(64bit) libqeglfs-kms-integration.so(Qt_6)(64bit) libqeglfs-kms-integration.so(Qt_6.0)(64bit) libqeglfs-kms-integration.so(Qt_6.1)(64bit) libqeglfs-kms-integration.so(Qt_6.2)(64bit) libqeglfs-kms-integration.so(Qt_6.3)(64bit) libqeglfs-kms-integration.so(Qt_6.4)(64bit) libqeglfs-kms-integration.so(Qt_6.5)(64bit) libqeglfs-kms-integration.so(Qt_6.5.0_PRIVATE_API)(64bit) libqeglfs-x11-integration.so()(64bit) libqeglfs-x11-integration.so(Qt_6)(64bit) libqeglfs-x11-integration.so(Qt_6.0)(64bit) libqeglfs-x11-integration.so(Qt_6.1)(64bit) libqeglfs-x11-integration.so(Qt_6.2)(64bit) libqeglfs-x11-integration.so(Qt_6.3)(64bit) libqeglfs-x11-integration.so(Qt_6.4)(64bit) libqeglfs-x11-integration.so(Qt_6.5)(64bit) libqeglfs-x11-integration.so(Qt_6.5.0_PRIVATE_API)(64bit) libqeglfs.so()(64bit) libqeglfs.so(Qt_6)(64bit) libqeglfs.so(Qt_6.0)(64bit) libqeglfs.so(Qt_6.1)(64bit) libqeglfs.so(Qt_6.2)(64bit) libqeglfs.so(Qt_6.3)(64bit) libqeglfs.so(Qt_6.4)(64bit) libqeglfs.so(Qt_6.5)(64bit) libqeglfs.so(Qt_6.5.0_PRIVATE_API)(64bit) libqevdevkeyboardplugin.so()(64bit) libqevdevkeyboardplugin.so(Qt_6)(64bit) libqevdevkeyboardplugin.so(Qt_6.0)(64bit) libqevdevkeyboardplugin.so(Qt_6.1)(64bit) libqevdevkeyboardplugin.so(Qt_6.2)(64bit) libqevdevkeyboardplugin.so(Qt_6.3)(64bit) libqevdevkeyboardplugin.so(Qt_6.4)(64bit) libqevdevkeyboardplugin.so(Qt_6.5)(64bit) libqevdevkeyboardplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqevdevmouseplugin.so()(64bit) libqevdevmouseplugin.so(Qt_6)(64bit) libqevdevmouseplugin.so(Qt_6.0)(64bit) libqevdevmouseplugin.so(Qt_6.1)(64bit) libqevdevmouseplugin.so(Qt_6.2)(64bit) libqevdevmouseplugin.so(Qt_6.3)(64bit) libqevdevmouseplugin.so(Qt_6.4)(64bit) libqevdevmouseplugin.so(Qt_6.5)(64bit) libqevdevmouseplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqevdevtabletplugin.so()(64bit) libqevdevtabletplugin.so(Qt_6)(64bit) libqevdevtabletplugin.so(Qt_6.0)(64bit) libqevdevtabletplugin.so(Qt_6.1)(64bit) libqevdevtabletplugin.so(Qt_6.2)(64bit) libqevdevtabletplugin.so(Qt_6.3)(64bit) libqevdevtabletplugin.so(Qt_6.4)(64bit) libqevdevtabletplugin.so(Qt_6.5)(64bit) libqevdevtabletplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqevdevtouchplugin.so()(64bit) libqevdevtouchplugin.so(Qt_6)(64bit) libqevdevtouchplugin.so(Qt_6.0)(64bit) libqevdevtouchplugin.so(Qt_6.1)(64bit) libqevdevtouchplugin.so(Qt_6.2)(64bit) libqevdevtouchplugin.so(Qt_6.3)(64bit) libqevdevtouchplugin.so(Qt_6.4)(64bit) libqevdevtouchplugin.so(Qt_6.5)(64bit) libqevdevtouchplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqgif.so()(64bit) libqgif.so(Qt_6)(64bit) libqgif.so(Qt_6.0)(64bit) libqgif.so(Qt_6.1)(64bit) libqgif.so(Qt_6.2)(64bit) libqgif.so(Qt_6.3)(64bit) libqgif.so(Qt_6.4)(64bit) libqgif.so(Qt_6.5)(64bit) libqgif.so(Qt_6.5.0_PRIVATE_API)(64bit) libqico.so()(64bit) libqico.so(Qt_6)(64bit) libqico.so(Qt_6.0)(64bit) libqico.so(Qt_6.1)(64bit) libqico.so(Qt_6.2)(64bit) libqico.so(Qt_6.3)(64bit) libqico.so(Qt_6.4)(64bit) libqico.so(Qt_6.5)(64bit) libqico.so(Qt_6.5.0_PRIVATE_API)(64bit) libqjpeg.so()(64bit) libqjpeg.so(Qt_6)(64bit) libqjpeg.so(Qt_6.0)(64bit) libqjpeg.so(Qt_6.1)(64bit) libqjpeg.so(Qt_6.2)(64bit) libqjpeg.so(Qt_6.3)(64bit) libqjpeg.so(Qt_6.4)(64bit) libqjpeg.so(Qt_6.5)(64bit) libqjpeg.so(Qt_6.5.0_PRIVATE_API)(64bit) libqlibinputplugin.so()(64bit) libqlibinputplugin.so(Qt_6)(64bit) libqlibinputplugin.so(Qt_6.0)(64bit) libqlibinputplugin.so(Qt_6.1)(64bit) libqlibinputplugin.so(Qt_6.2)(64bit) libqlibinputplugin.so(Qt_6.3)(64bit) libqlibinputplugin.so(Qt_6.4)(64bit) libqlibinputplugin.so(Qt_6.5)(64bit) libqlibinputplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqlinuxfb.so()(64bit) libqlinuxfb.so(Qt_6)(64bit) libqlinuxfb.so(Qt_6.0)(64bit) libqlinuxfb.so(Qt_6.1)(64bit) libqlinuxfb.so(Qt_6.2)(64bit) libqlinuxfb.so(Qt_6.3)(64bit) libqlinuxfb.so(Qt_6.4)(64bit) libqlinuxfb.so(Qt_6.5)(64bit) libqlinuxfb.so(Qt_6.5.0_PRIVATE_API)(64bit) libqminimal.so()(64bit) libqminimal.so(Qt_6)(64bit) libqminimal.so(Qt_6.0)(64bit) libqminimal.so(Qt_6.1)(64bit) libqminimal.so(Qt_6.2)(64bit) libqminimal.so(Qt_6.3)(64bit) libqminimal.so(Qt_6.4)(64bit) libqminimal.so(Qt_6.5)(64bit) libqminimal.so(Qt_6.5.0_PRIVATE_API)(64bit) libqminimalegl.so()(64bit) libqminimalegl.so(Qt_6)(64bit) libqminimalegl.so(Qt_6.0)(64bit) libqminimalegl.so(Qt_6.1)(64bit) libqminimalegl.so(Qt_6.2)(64bit) libqminimalegl.so(Qt_6.3)(64bit) libqminimalegl.so(Qt_6.4)(64bit) libqminimalegl.so(Qt_6.5)(64bit) libqminimalegl.so(Qt_6.5.0_PRIVATE_API)(64bit) libqoffscreen.so()(64bit) libqoffscreen.so(Qt_6)(64bit) libqoffscreen.so(Qt_6.0)(64bit) libqoffscreen.so(Qt_6.1)(64bit) libqoffscreen.so(Qt_6.2)(64bit) libqoffscreen.so(Qt_6.3)(64bit) libqoffscreen.so(Qt_6.4)(64bit) libqoffscreen.so(Qt_6.5)(64bit) libqoffscreen.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtslibplugin.so()(64bit) libqtslibplugin.so(Qt_6)(64bit) libqtslibplugin.so(Qt_6.0)(64bit) libqtslibplugin.so(Qt_6.1)(64bit) libqtslibplugin.so(Qt_6.2)(64bit) libqtslibplugin.so(Qt_6.3)(64bit) libqtslibplugin.so(Qt_6.4)(64bit) libqtslibplugin.so(Qt_6.5)(64bit) libqtslibplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtuiotouchplugin.so()(64bit) libqtuiotouchplugin.so(Qt_6)(64bit) libqtuiotouchplugin.so(Qt_6.0)(64bit) libqtuiotouchplugin.so(Qt_6.1)(64bit) libqtuiotouchplugin.so(Qt_6.2)(64bit) libqtuiotouchplugin.so(Qt_6.3)(64bit) libqtuiotouchplugin.so(Qt_6.4)(64bit) libqtuiotouchplugin.so(Qt_6.5)(64bit) libqtuiotouchplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqvkkhrdisplay.so()(64bit) libqvkkhrdisplay.so(Qt_6)(64bit) libqvkkhrdisplay.so(Qt_6.0)(64bit) libqvkkhrdisplay.so(Qt_6.1)(64bit) libqvkkhrdisplay.so(Qt_6.2)(64bit) libqvkkhrdisplay.so(Qt_6.3)(64bit) libqvkkhrdisplay.so(Qt_6.4)(64bit) libqvkkhrdisplay.so(Qt_6.5)(64bit) libqvkkhrdisplay.so(Qt_6.5.0_PRIVATE_API)(64bit) libqvnc.so()(64bit) libqvnc.so(Qt_6)(64bit) libqvnc.so(Qt_6.0)(64bit) libqvnc.so(Qt_6.1)(64bit) libqvnc.so(Qt_6.2)(64bit) libqvnc.so(Qt_6.3)(64bit) libqvnc.so(Qt_6.4)(64bit) libqvnc.so(Qt_6.5)(64bit) libqvnc.so(Qt_6.5.0_PRIVATE_API)(64bit) libqxcb-egl-integration.so()(64bit) libqxcb-egl-integration.so(Qt_6)(64bit) libqxcb-egl-integration.so(Qt_6.0)(64bit) libqxcb-egl-integration.so(Qt_6.1)(64bit) libqxcb-egl-integration.so(Qt_6.2)(64bit) libqxcb-egl-integration.so(Qt_6.3)(64bit) libqxcb-egl-integration.so(Qt_6.4)(64bit) libqxcb-egl-integration.so(Qt_6.5)(64bit) libqxcb-egl-integration.so(Qt_6.5.0_PRIVATE_API)(64bit) libqxcb.so()(64bit) libqxcb.so(Qt_6)(64bit) libqxcb.so(Qt_6.0)(64bit) libqxcb.so(Qt_6.1)(64bit) libqxcb.so(Qt_6.2)(64bit) libqxcb.so(Qt_6.3)(64bit) libqxcb.so(Qt_6.4)(64bit) libqxcb.so(Qt_6.5)(64bit) libqxcb.so(Qt_6.5.0_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "(qt6-wayland if xwayland) /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libICE.so.6()(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core6 libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6DBus6 libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6OpenGL.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libSM.so.6()(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libgbm.so.1()(64bit) libglib-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit) libinput.so.10()(64bit) libinput.so.10(LIBINPUT_0.12.0)(64bit) libinput.so.10(LIBINPUT_1.19)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmtdev.so.1()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libts.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libxcb-cursor.so.0()(64bit) libxcb-icccm.so.4()(64bit) libxcb-image.so.0()(64bit) libxcb-keysyms.so.1()(64bit) libxcb-randr.so.0()(64bit) libxcb-render-util.so.0()(64bit) libxcb-render.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb-xfixes.so.0()(64bit) libxcb-xinput.so.0()(64bit) libxcb-xkb.so.1()(64bit) libxcb.so.1()(64bit) libxkbcommon-x11.so.0()(64bit) libxkbcommon-x11.so.0(V_0.5.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libz.so.1()(64bit)"

inherit rpm
