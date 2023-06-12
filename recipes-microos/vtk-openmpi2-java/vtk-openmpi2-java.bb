SUMMARY = "Java bindings for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides java bindings for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-openmpi2-java-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "946ce54011300e9032db5b76e5b4b0e74ad850eb11848ab457b436782be7ee826517b81de1189ed3df73888ece83b49b00679e3995b561995501d4e3e887f5e4"

RPROVIDES:${PN} += "libvtkChartsCoreJava.so()(64bit) \
libvtkCommonColorJava.so()(64bit) \
libvtkCommonComputationalGeometryJava.so()(64bit) \
libvtkCommonCoreJava.so()(64bit) \
libvtkCommonDataModelJava.so()(64bit) \
libvtkCommonExecutionModelJava.so()(64bit) \
libvtkCommonMathJava.so()(64bit) \
libvtkCommonMiscJava.so()(64bit) \
libvtkCommonPythonJava.so()(64bit) \
libvtkCommonSystemJava.so()(64bit) \
libvtkCommonTransformsJava.so()(64bit) \
libvtkDomainsChemistryJava.so()(64bit) \
libvtkDomainsChemistryOpenGL2Java.so()(64bit) \
libvtkDomainsParallelChemistryJava.so()(64bit) \
libvtkFiltersAMRJava.so()(64bit) \
libvtkFiltersCoreJava.so()(64bit) \
libvtkFiltersExtractionJava.so()(64bit) \
libvtkFiltersFlowPathsJava.so()(64bit) \
libvtkFiltersGeneralJava.so()(64bit) \
libvtkFiltersGenericJava.so()(64bit) \
libvtkFiltersGeometryJava.so()(64bit) \
libvtkFiltersHybridJava.so()(64bit) \
libvtkFiltersHyperTreeJava.so()(64bit) \
libvtkFiltersImagingJava.so()(64bit) \
libvtkFiltersModelingJava.so()(64bit) \
libvtkFiltersParallelGeometryJava.so()(64bit) \
libvtkFiltersParallelImagingJava.so()(64bit) \
libvtkFiltersParallelJava.so()(64bit) \
libvtkFiltersParallelMPIJava.so()(64bit) \
libvtkFiltersParallelVerdictJava.so()(64bit) \
libvtkFiltersPointsJava.so()(64bit) \
libvtkFiltersProgrammableJava.so()(64bit) \
libvtkFiltersPythonJava.so()(64bit) \
libvtkFiltersSMPJava.so()(64bit) \
libvtkFiltersSelectionJava.so()(64bit) \
libvtkFiltersSourcesJava.so()(64bit) \
libvtkFiltersStatisticsJava.so()(64bit) \
libvtkFiltersTextureJava.so()(64bit) \
libvtkFiltersTopologyJava.so()(64bit) \
libvtkFiltersVerdictJava.so()(64bit) \
libvtkGeovisCoreJava.so()(64bit) \
libvtkIOAMRJava.so()(64bit) \
libvtkIOAsynchronousJava.so()(64bit) \
libvtkIOCGNSReaderJava.so()(64bit) \
libvtkIOCONVERGECFDJava.so()(64bit) \
libvtkIOCesium3DTilesJava.so()(64bit) \
libvtkIOChemistryJava.so()(64bit) \
libvtkIOCityGMLJava.so()(64bit) \
libvtkIOCoreJava.so()(64bit) \
libvtkIOEnSightJava.so()(64bit) \
libvtkIOExodusJava.so()(64bit) \
libvtkIOExportJava.so()(64bit) \
libvtkIOExportPDFJava.so()(64bit) \
libvtkIOGeometryJava.so()(64bit) \
libvtkIOHDFJava.so()(64bit) \
libvtkIOImageJava.so()(64bit) \
libvtkIOImportJava.so()(64bit) \
libvtkIOInfovisJava.so()(64bit) \
libvtkIOLSDynaJava.so()(64bit) \
libvtkIOLegacyJava.so()(64bit) \
libvtkIOMINCJava.so()(64bit) \
libvtkIOMPIImageJava.so()(64bit) \
libvtkIOMPIParallelJava.so()(64bit) \
libvtkIOMovieJava.so()(64bit) \
libvtkIONetCDFJava.so()(64bit) \
libvtkIOOggTheoraJava.so()(64bit) \
libvtkIOPLYJava.so()(64bit) \
libvtkIOParallelJava.so()(64bit) \
libvtkIOParallelNetCDFJava.so()(64bit) \
libvtkIOParallelXMLJava.so()(64bit) \
libvtkIOSQLJava.so()(64bit) \
libvtkIOSegYJava.so()(64bit) \
libvtkIOTecplotTableJava.so()(64bit) \
libvtkIOVeraOutJava.so()(64bit) \
libvtkIOVideoJava.so()(64bit) \
libvtkIOXMLJava.so()(64bit) \
libvtkIOXMLParserJava.so()(64bit) \
libvtkImagingColorJava.so()(64bit) \
libvtkImagingCoreJava.so()(64bit) \
libvtkImagingFourierJava.so()(64bit) \
libvtkImagingGeneralJava.so()(64bit) \
libvtkImagingHybridJava.so()(64bit) \
libvtkImagingMathJava.so()(64bit) \
libvtkImagingMorphologicalJava.so()(64bit) \
libvtkImagingSourcesJava.so()(64bit) \
libvtkImagingStatisticsJava.so()(64bit) \
libvtkImagingStencilJava.so()(64bit) \
libvtkInfovisCoreJava.so()(64bit) \
libvtkInfovisLayoutJava.so()(64bit) \
libvtkInteractionImageJava.so()(64bit) \
libvtkInteractionStyleJava.so()(64bit) \
libvtkInteractionWidgetsJava.so()(64bit) \
libvtkParallelCoreJava.so()(64bit) \
libvtkParallelMPI4PyJava.so()(64bit) \
libvtkParallelMPIJava.so()(64bit) \
libvtkPythonContext2DJava.so()(64bit) \
libvtkRenderingAnnotationJava.so()(64bit) \
libvtkRenderingContext2DJava.so()(64bit) \
libvtkRenderingContextOpenGL2Java.so()(64bit) \
libvtkRenderingCoreJava.so()(64bit) \
libvtkRenderingFreeTypeJava.so()(64bit) \
libvtkRenderingHyperTreeGridJava.so()(64bit) \
libvtkRenderingImageJava.so()(64bit) \
libvtkRenderingLODJava.so()(64bit) \
libvtkRenderingLabelJava.so()(64bit) \
libvtkRenderingOpenGL2Java.so()(64bit) \
libvtkRenderingQtJava.so()(64bit) \
libvtkRenderingSceneGraphJava.so()(64bit) \
libvtkRenderingUIJava.so()(64bit) \
libvtkRenderingVolumeJava.so()(64bit) \
libvtkRenderingVolumeOpenGL2Java.so()(64bit) \
libvtkRenderingVtkJSJava.so()(64bit) \
libvtkTestingRenderingJava.so()(64bit) \
libvtkViewsContext2DJava.so()(64bit) \
libvtkViewsCoreJava.so()(64bit) \
libvtkViewsInfovisJava.so()(64bit) \
vtk-openmpi2-java \
vtk-openmpi2-java(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjawt.so()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libvtk1-openmpi2 \
libvtkChartsCore.so.1()(64bit) \
libvtkCommonColor.so.1()(64bit) \
libvtkCommonComputationalGeometry.so.1()(64bit) \
libvtkCommonCore.so.1()(64bit) \
libvtkCommonDataModel.so.1()(64bit) \
libvtkCommonExecutionModel.so.1()(64bit) \
libvtkCommonMath.so.1()(64bit) \
libvtkCommonMisc.so.1()(64bit) \
libvtkCommonSystem.so.1()(64bit) \
libvtkCommonTransforms.so.1()(64bit) \
libvtkDomainsChemistry.so.1()(64bit) \
libvtkDomainsChemistryOpenGL2.so.1()(64bit) \
libvtkDomainsParallelChemistry.so.1()(64bit) \
libvtkFiltersAMR.so.1()(64bit) \
libvtkFiltersCore.so.1()(64bit) \
libvtkFiltersExtraction.so.1()(64bit) \
libvtkFiltersFlowPaths.so.1()(64bit) \
libvtkFiltersGeneral.so.1()(64bit) \
libvtkFiltersGeneric.so.1()(64bit) \
libvtkFiltersGeometry.so.1()(64bit) \
libvtkFiltersHybrid.so.1()(64bit) \
libvtkFiltersHyperTree.so.1()(64bit) \
libvtkFiltersImaging.so.1()(64bit) \
libvtkFiltersModeling.so.1()(64bit) \
libvtkFiltersParallel.so.1()(64bit) \
libvtkFiltersParallelGeometry.so.1()(64bit) \
libvtkFiltersParallelImaging.so.1()(64bit) \
libvtkFiltersParallelMPI.so.1()(64bit) \
libvtkFiltersParallelVerdict.so.1()(64bit) \
libvtkFiltersPoints.so.1()(64bit) \
libvtkFiltersProgrammable.so.1()(64bit) \
libvtkFiltersSMP.so.1()(64bit) \
libvtkFiltersSelection.so.1()(64bit) \
libvtkFiltersSources.so.1()(64bit) \
libvtkFiltersStatistics.so.1()(64bit) \
libvtkFiltersTexture.so.1()(64bit) \
libvtkFiltersTopology.so.1()(64bit) \
libvtkFiltersVerdict.so.1()(64bit) \
libvtkGeovisCore.so.1()(64bit) \
libvtkIOAMR.so.1()(64bit) \
libvtkIOAsynchronous.so.1()(64bit) \
libvtkIOCGNSReader.so.1()(64bit) \
libvtkIOCONVERGECFD.so.1()(64bit) \
libvtkIOCesium3DTiles.so.1()(64bit) \
libvtkIOChemistry.so.1()(64bit) \
libvtkIOCityGML.so.1()(64bit) \
libvtkIOCore.so.1()(64bit) \
libvtkIOEnSight.so.1()(64bit) \
libvtkIOExodus.so.1()(64bit) \
libvtkIOExport.so.1()(64bit) \
libvtkIOExportPDF.so.1()(64bit) \
libvtkIOGeometry.so.1()(64bit) \
libvtkIOHDF.so.1()(64bit) \
libvtkIOImage.so.1()(64bit) \
libvtkIOImport.so.1()(64bit) \
libvtkIOInfovis.so.1()(64bit) \
libvtkIOLSDyna.so.1()(64bit) \
libvtkIOLegacy.so.1()(64bit) \
libvtkIOMINC.so.1()(64bit) \
libvtkIOMPIImage.so.1()(64bit) \
libvtkIOMPIParallel.so.1()(64bit) \
libvtkIOMovie.so.1()(64bit) \
libvtkIONetCDF.so.1()(64bit) \
libvtkIOOggTheora.so.1()(64bit) \
libvtkIOPLY.so.1()(64bit) \
libvtkIOParallel.so.1()(64bit) \
libvtkIOParallelNetCDF.so.1()(64bit) \
libvtkIOParallelXML.so.1()(64bit) \
libvtkIOSQL.so.1()(64bit) \
libvtkIOSegY.so.1()(64bit) \
libvtkIOTecplotTable.so.1()(64bit) \
libvtkIOVeraOut.so.1()(64bit) \
libvtkIOVideo.so.1()(64bit) \
libvtkIOXML.so.1()(64bit) \
libvtkIOXMLParser.so.1()(64bit) \
libvtkImagingColor.so.1()(64bit) \
libvtkImagingCore.so.1()(64bit) \
libvtkImagingFourier.so.1()(64bit) \
libvtkImagingGeneral.so.1()(64bit) \
libvtkImagingHybrid.so.1()(64bit) \
libvtkImagingMath.so.1()(64bit) \
libvtkImagingMorphological.so.1()(64bit) \
libvtkImagingSources.so.1()(64bit) \
libvtkImagingStatistics.so.1()(64bit) \
libvtkImagingStencil.so.1()(64bit) \
libvtkInfovisCore.so.1()(64bit) \
libvtkInfovisLayout.so.1()(64bit) \
libvtkInteractionImage.so.1()(64bit) \
libvtkInteractionStyle.so.1()(64bit) \
libvtkInteractionWidgets.so.1()(64bit) \
libvtkJava.so.1()(64bit) \
libvtkParallelCore.so.1()(64bit) \
libvtkParallelMPI.so.1()(64bit) \
libvtkRenderingAnnotation.so.1()(64bit) \
libvtkRenderingContext2D.so.1()(64bit) \
libvtkRenderingContextOpenGL2.so.1()(64bit) \
libvtkRenderingCore.so.1()(64bit) \
libvtkRenderingFreeType.so.1()(64bit) \
libvtkRenderingHyperTreeGrid.so.1()(64bit) \
libvtkRenderingImage.so.1()(64bit) \
libvtkRenderingLOD.so.1()(64bit) \
libvtkRenderingLabel.so.1()(64bit) \
libvtkRenderingOpenGL2.so.1()(64bit) \
libvtkRenderingQt.so.1()(64bit) \
libvtkRenderingSceneGraph.so.1()(64bit) \
libvtkRenderingUI.so.1()(64bit) \
libvtkRenderingVolume.so.1()(64bit) \
libvtkRenderingVolumeOpenGL2.so.1()(64bit) \
libvtkRenderingVtkJS.so.1()(64bit) \
libvtkTestingRendering.so.1()(64bit) \
libvtkViewsContext2D.so.1()(64bit) \
libvtkViewsCore.so.1()(64bit) \
libvtkViewsInfovis.so.1()(64bit) \
libvtksys.so.1()(64bit)"

inherit rpm
