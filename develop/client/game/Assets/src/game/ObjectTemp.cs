using System;
using ShineEngine;
using UnityEngine;
using UnityEngine.AI;

/// <summary>
///
/// </summary>
public class ObjectTemp:MonoBehaviour
{
	private NavMeshAgent _agent;

	private Camera _camera;
	private void Start()
	{
		_agent=gameObject.GetComponent<NavMeshAgent>();
		_camera=GameObject.Find("Camera").GetComponent<Camera>();

//		NavMeshData nData=new NavMeshData();


	}

	private void Update()
	{
		if(Input.GetMouseButtonDown(0))
		{
			Ray ray=_camera.ScreenPointToRay(Input.mousePosition);
		
			RaycastHit hitInfo;
			if(Physics.Raycast(ray,out hitInfo))
			{
				_agent.SetDestination(hitInfo.point);
			}
		}
	}
}