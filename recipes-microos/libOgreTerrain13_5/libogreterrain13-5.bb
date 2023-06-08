SUMMARY = "Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
The Ogre Terrain System features: \
 \
* SceneManager independent, integrates with (optional) Paging component \
* Hierarchical geometry batching: batch count reduced at lower LODs as well as \
  vertex count. At the lowest level of detail, the entire terrain page is a \
  single batch which has obvious advantages for large paging terrains over the \
  fixed tiles previously used. \
* Skirts are used instead of stitching to avoid cracks in geometry. This means \
  fewer indexing arrangements and lower overall index buffer usage. \
* Built-in support for splatting layers, configurable sampler inputs and \
  pluggable material generators. \
* Support for generating global normal maps and light maps in a background \
  thread. \
* LOD now adapts in real-time to camera settings (viewport sizes & LOD bias) so \
  you can use the same terrain with multiple views efficiently."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreTerrain13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "950cd4836fa4e5334b542d5fdb0814a199c523343d356913f5c85ce4416a969fbbba21800377eb75d0be43549a1b0fbc042f4a4db365760267e6a2b901ad9850"

RPROVIDES:${PN} += "libOgreTerrain.so.13.5()(64bit) libOgreTerrain13_5 libOgreTerrain13_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOgreMain.so.13.5()(64bit) libOgrePaging.so.13.5()(64bit) libOgreRTShaderSystem.so.13.5()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
