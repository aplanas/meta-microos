SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "libgmsh4_11-4.11.1-2.1.aarch64.rpm"
RPM_HASH = "bc32297f0b04593fb890660c44f01da84953e5089cacd8528c4d18170e02fc29e4b48905b4afdfd7227c132e448bf7d5e2f4794935e7d6041f5425b2ebd4f6be"

RPROVIDES:${PN} += "libgmsh.so.4.11()(64bit) libgmsh4_11 libgmsh4_11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libTKBO.so.7.7()(64bit) libTKBRep.so.7.7()(64bit) libTKFillet.so.7.7()(64bit) libTKG2d.so.7.7()(64bit) libTKG3d.so.7.7()(64bit) libTKGeomAlgo.so.7.7()(64bit) libTKGeomBase.so.7.7()(64bit) libTKIGES.so.7.7()(64bit) libTKLCAF.so.7.7()(64bit) libTKMath.so.7.7()(64bit) libTKMesh.so.7.7()(64bit) libTKOffset.so.7.7()(64bit) libTKPrim.so.7.7()(64bit) libTKSTEP.so.7.7()(64bit) libTKShHealing.so.7.7()(64bit) libTKTopAlgo.so.7.7()(64bit) libTKXCAF.so.7.7()(64bit) libTKXDEIGES.so.7.7()(64bit) libTKXDESTEP.so.7.7()(64bit) libTKXSBase.so.7.7()(64bit) libTKernel.so.7.7()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcgns.so.4.3()(64bit) libfltk.so.1.3()(64bit) libfltk_gl.so.1.3()(64bit) libfltk_images.so.1.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgl2ps.so.1()(64bit) libgl2ps1 libgmp.so.10()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_2.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmetis.so.5()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
