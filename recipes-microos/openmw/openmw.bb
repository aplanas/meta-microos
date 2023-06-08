SUMMARY = "Reimplementation of The Elder Scrolls III: Morrowind"
DESCRIPTION = "OpenMW is a new and modern engine based on the one that runs the 2002 open-world RPG Morrowind. The engine (OpenMW) will come with its own editor (OpenCS) which will allow the user to edit or create their own games. Both OpenCS and OpenMW are written from scratch and aren’t made to support any third party programs the original Morrowind engine uses to improve its functionality. \
To give you a better idea of what this project is about, here are some of the aims for the future of the OpenMW engine: \
 \
  * Be a full-featured reimplementation of the Morrowind engine. \
  * Run natively on Windows, Linux and MacOS X. \
  * Support all existing content, including Tribunal, Bloodmoon and all user created mods (in case they don’t \
     use external programs). \
  * Allow much greater modability: change game rules, create new spell effects, etc. through scripting. \
  * Fix system design bugs, like save-game “doubling” problem. \
  * Improve the interface and journal system. \
  * Improved graphics by taking advantage of more modern hardware. \
  * Support to improve game mechanics, physics, combat and AI. \
  * (Possibly) Support to implement multiplayer \
  * (Possibly) Support to run on mobile devices. \
 \
NOTE(!!!): Playing Morrowind with this engine STILL REQUIRES one to own the Morrowind data files. \
 \
OpenCS will support the editing of all OpenMW features. We aim for the editor to stay fully up-to-date with the corresponding OpenMW version, allowing the user to edit any newly implemented features. Post v1.0 features are going to be the use of OpenCS as a debugging tool for OpenMW content and the support for editor plugins. \
These are files that add to the editor code, improving its functionality to allow it to have some nice extras. \
The OpenCS is not based on the editing tool which came with the original Morrowind game, it is a program made by modders for modders. Important properties of the OpenCS are: \
 \
 * non-blocking \
 * multi-threaded \
 * multi-document support \
 * multi-view support \
 * high scalability \
 * customisable GUI"
LICENSE = "GPL-3.0-only & MIT"

PV = "0.48.0~rc9"

RPM_NAME = "openmw-0.48.0~rc9-1.2.aarch64.rpm"
RPM_HASH = "224655f27b38b006da66073e51c3404baba9dec654c3f96caa0f511c6626f8b442923f789395e5bfd0d38402d0d369cb00b8edcf887965252936c750ae193479"

RPROVIDES:${PN} += "application() application(org.openmw.cs.desktop) application(org.openmw.launcher.desktop) config(openmw) metainfo() metainfo(openmw.appdata.xml) openmw openmw(aarch-64)"
RDEPENDS:${PN} += "/bin/sh OpenSceneGraph-plugins desktop-file-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libBulletCollision.so.3.17()(64bit) libDebugUtils.so.1()(64bit) libDetour.so.1()(64bit) libGL.so.1()(64bit) libLinearMath.so.3.17()(64bit) libMyGUIEngine.so.3.4.1()(64bit) libOpenThreads.so.21()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libRecast.so.1()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libboost_filesystem.so.1.82.0()(64bit) libboost_iostreams.so.1.82.0()(64bit) libboost_program_options.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libluajit-5.1.so.2()(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libosg.so.161()(64bit) libosgAnimation.so.161()(64bit) libosgDB.so.161()(64bit) libosgFX.so.161()(64bit) libosgGA.so.161()(64bit) libosgParticle.so.161()(64bit) libosgShadow.so.161()(64bit) libosgText.so.161()(64bit) libosgUtil.so.161()(64bit) libosgViewer.so.161()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libswresample.so.4()(64bit) libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) libtinyxml.so.0()(64bit) libunshield.so.0()(64bit) libyaml-cpp.so.0.7()(64bit)"

inherit rpm
