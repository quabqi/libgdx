/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btVoronoiSimplexSolver extends BulletBase {
	private long swigCPtr;
	
	protected btVoronoiSimplexSolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btVoronoiSimplexSolver, normally you should not need this constructor it's intended for low-level usage. */ 
	public btVoronoiSimplexSolver(long cPtr, boolean cMemoryOwn) {
		this("btVoronoiSimplexSolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btVoronoiSimplexSolver obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btVoronoiSimplexSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btVoronoiSimplexSolver_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btVoronoiSimplexSolver_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btVoronoiSimplexSolver_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btVoronoiSimplexSolver_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btVoronoiSimplexSolver_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btVoronoiSimplexSolver_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btVoronoiSimplexSolver_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btVoronoiSimplexSolver_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void setNumVertices(int value) {
    CollisionJNI.btVoronoiSimplexSolver_numVertices_set(swigCPtr, this, value);
  }

  public int getNumVertices() {
    return CollisionJNI.btVoronoiSimplexSolver_numVertices_get(swigCPtr, this);
  }

  public void setSimplexVectorW(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_simplexVectorW_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getSimplexVectorW() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_simplexVectorW_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setSimplexPointsP(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_simplexPointsP_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getSimplexPointsP() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_simplexPointsP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setSimplexPointsQ(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_simplexPointsQ_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getSimplexPointsQ() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_simplexPointsQ_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCachedP1(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_cachedP1_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCachedP1() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_cachedP1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCachedP2(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_cachedP2_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCachedP2() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_cachedP2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCachedV(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_cachedV_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCachedV() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_cachedV_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setLastW(btVector3 value) {
    CollisionJNI.btVoronoiSimplexSolver_lastW_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLastW() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_lastW_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setEqualVertexThreshold(float value) {
    CollisionJNI.btVoronoiSimplexSolver_equalVertexThreshold_set(swigCPtr, this, value);
  }

  public float getEqualVertexThreshold() {
    return CollisionJNI.btVoronoiSimplexSolver_equalVertexThreshold_get(swigCPtr, this);
  }

  public void setCachedValidClosest(boolean value) {
    CollisionJNI.btVoronoiSimplexSolver_cachedValidClosest_set(swigCPtr, this, value);
  }

  public boolean getCachedValidClosest() {
    return CollisionJNI.btVoronoiSimplexSolver_cachedValidClosest_get(swigCPtr, this);
  }

  public void setCachedBC(btSubSimplexClosestResult value) {
    CollisionJNI.btVoronoiSimplexSolver_cachedBC_set(swigCPtr, this, btSubSimplexClosestResult.getCPtr(value), value);
  }

  public btSubSimplexClosestResult getCachedBC() {
    long cPtr = CollisionJNI.btVoronoiSimplexSolver_cachedBC_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btSubSimplexClosestResult(cPtr, false);
  }

  public void setNeedsUpdate(boolean value) {
    CollisionJNI.btVoronoiSimplexSolver_needsUpdate_set(swigCPtr, this, value);
  }

  public boolean getNeedsUpdate() {
    return CollisionJNI.btVoronoiSimplexSolver_needsUpdate_get(swigCPtr, this);
  }

  public void removeVertex(int index) {
    CollisionJNI.btVoronoiSimplexSolver_removeVertex(swigCPtr, this, index);
  }

  public void reduceVertices(btUsageBitfield usedVerts) {
    CollisionJNI.btVoronoiSimplexSolver_reduceVertices(swigCPtr, this, btUsageBitfield.getCPtr(usedVerts), usedVerts);
  }

  public boolean updateClosestVectorAndPoints() {
    return CollisionJNI.btVoronoiSimplexSolver_updateClosestVectorAndPoints(swigCPtr, this);
  }

  public boolean closestPtPointTetrahedron(Vector3 p, Vector3 a, Vector3 b, Vector3 c, Vector3 d, btSubSimplexClosestResult finalResult) {
    return CollisionJNI.btVoronoiSimplexSolver_closestPtPointTetrahedron(swigCPtr, this, p, a, b, c, d, btSubSimplexClosestResult.getCPtr(finalResult), finalResult);
  }

  public int pointOutsideOfPlane(Vector3 p, Vector3 a, Vector3 b, Vector3 c, Vector3 d) {
    return CollisionJNI.btVoronoiSimplexSolver_pointOutsideOfPlane(swigCPtr, this, p, a, b, c, d);
  }

  public boolean closestPtPointTriangle(Vector3 p, Vector3 a, Vector3 b, Vector3 c, btSubSimplexClosestResult result) {
    return CollisionJNI.btVoronoiSimplexSolver_closestPtPointTriangle(swigCPtr, this, p, a, b, c, btSubSimplexClosestResult.getCPtr(result), result);
  }

  public btVoronoiSimplexSolver() {
    this(CollisionJNI.new_btVoronoiSimplexSolver(), true);
  }

  public void reset() {
    CollisionJNI.btVoronoiSimplexSolver_reset(swigCPtr, this);
  }

  public void addVertex(Vector3 w, Vector3 p, Vector3 q) {
    CollisionJNI.btVoronoiSimplexSolver_addVertex(swigCPtr, this, w, p, q);
  }

  public boolean closest(Vector3 v) {
    return CollisionJNI.btVoronoiSimplexSolver_closest(swigCPtr, this, v);
  }

  public float maxVertex() {
    return CollisionJNI.btVoronoiSimplexSolver_maxVertex(swigCPtr, this);
  }

  public boolean fullSimplex() {
    return CollisionJNI.btVoronoiSimplexSolver_fullSimplex(swigCPtr, this);
  }

  public int getSimplex(btVector3 pBuf, btVector3 qBuf, btVector3 yBuf) {
    return CollisionJNI.btVoronoiSimplexSolver_getSimplex(swigCPtr, this, btVector3.getCPtr(pBuf), pBuf, btVector3.getCPtr(qBuf), qBuf, btVector3.getCPtr(yBuf), yBuf);
  }

  public boolean inSimplex(Vector3 w) {
    return CollisionJNI.btVoronoiSimplexSolver_inSimplex(swigCPtr, this, w);
  }

  public void backup_closest(Vector3 v) {
    CollisionJNI.btVoronoiSimplexSolver_backup_closest(swigCPtr, this, v);
  }

  public boolean emptySimplex() {
    return CollisionJNI.btVoronoiSimplexSolver_emptySimplex(swigCPtr, this);
  }

  public void compute_points(Vector3 p1, Vector3 p2) {
    CollisionJNI.btVoronoiSimplexSolver_compute_points(swigCPtr, this, p1, p2);
  }

  public int m_numVerticesVar() {
    return CollisionJNI.btVoronoiSimplexSolver_m_numVerticesVar(swigCPtr, this);
  }

}
